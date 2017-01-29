import static java.lang.System.out;

public class BasicMap extends Map {
    BasicTile a = new BasicTile("a");
    BasicTile b = new BasicTile("b");
    BasicTile c = new BasicTile("c");
    Tile[][] area = {
        {a, a, b},
        {a, c, c},
        {a, a, a}
    };

    void BasicMap() {}

    void OneOne() {
        out.println(area[1][1].getName());
    }
}