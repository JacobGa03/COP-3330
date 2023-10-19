import java.util.*;


public class GenericChallenge {
    public static void main(String[] args) {
        var natUSParks = new Park[]{
            new Park("Yellow Stone", "44.4,-110.6"),
            new Park("Yosemite", "37.84,-119.5"),
            new Park("Grand Canyon","36.1,-112.0")
        };

        Layer<Park> parkLayer = new Layer<>(natUSParks);
        parkLayer.renderLayer();

        // var natUSRivers = new River[]{
        //     new River(""),
        //     new River(""),
        //     new River()
        // };
    }
}

interface Mappable{
    public void render();

    //Helpful to breakdown lat/lon coordinates by user into doubles
    static double[] stringToLocation(String location){
        String[] temp = location.split(",");
        double lat = Double.parseDouble(temp[0]);
        double lon = Double.parseDouble(temp[1]);

        return new double[] {lat,lon};
    }
}

abstract class Point implements Mappable{
   
    private double[] location = new double[2];

    public Point(String location){
        this.location = Mappable.stringToLocation(location);
    }

    public void render(){
        System.out.println("Render "+this+" as POINT ("+location() + ")");
    }

   private String location(){
        return Arrays.toString(location);
   }
}

abstract class Line implements Mappable{
    private double[][] locations;

    public Line(String... locations){
        this.locations = new double[locations.length][];

        int index = 0;
        for(var l : locations){
            this.locations[index++] = Mappable.stringToLocation(l);
        }
    }

    private String locations(){
        return Arrays.deepToString(locations);
    }

    public void render(){
        System.out.println("Render " + this + " as LINE(" + locations() + ")");
    }
}

class Park extends Point{
    private String name;

    public Park(String name,String location){
        super(location);
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name + " National Park";
    }
}

class River extends Line{
    private String name;

    public River(String name,String... locations){
        super(locations);
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name + " River";
    }
}

class Layer<T extends Mappable>{
    private List<T> layerElements;

    public Layer(T[] layerElements){
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }

    public void addElements(T...elements){
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer(){

        for(T element: layerElements){
            element.render();
        }
    }
}