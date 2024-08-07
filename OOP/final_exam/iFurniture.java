package untitled.src.finalexam;

public interface iFurniture {
    double getLength();
    double getWidth();
    void setLegs(int l)throws Exception;
    void setHeight(double h)throws Exception;
    void setLength(double l)throws Exception;
    void setWidth(double w)throws Exception;
    void setDrawers(int d)throws Exception;
    Furniture increment(int i)throws Exception;
    Furniture resize(double factor)throws Exception;
}
