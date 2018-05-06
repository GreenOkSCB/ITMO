package lesson7;

import java.util.Objects;

public class TstObject {
    private String name;
    private int count;

//    переобпределение equals и hashCode - alt + insert в idea
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TstObject)) return false;
        TstObject tstObject = (TstObject) o;
        return count == tstObject.count &&
                Objects.equals(name, tstObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

//    переопределение toString - alt + insert в idea
    @Override
    public String toString() {
        return "TstObject{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
