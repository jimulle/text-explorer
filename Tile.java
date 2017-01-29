public abstract class Tile {
    String name;

    Tile(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    abstract void enter();
}