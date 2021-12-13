// 16. На плоскости ХОY задана своими координатами точка А. Указать, где она
// расположена (на какой оси или в каком координатном угле)

package by.neuhen.task01javabasic.service.branching;

import by.neuhen.task01javabasic.entity.Point;

public class DotLocation {

    private Point dot = new Point();
    private String dotLocation;

    public void setDot(Point dot) {
        this.dot = dot;
    }

    public void defineDotLocation() {

        if (dot.getX() == 0 && dot.getY() == 0) {
            dotLocation = "dot is on the origin of the coordinate axis";
        } else if (dot.getX() == 0) {
            dotLocation = "dot is on the X axis";
        } else if (dot.getY() == 0) {
            dotLocation = "dot is on the Y axis";
        } else if (dot.getY() > 0 && dot.getX() > 0) {
            dotLocation = "dot is on the first quarter";
        } else if (dot.getY() > 0 && dot.getX() < 0) {
            dotLocation = "dot is on the second quarter";
        } else if (dot.getY() < 0 && dot.getX() > 0) {
            dotLocation = "dot is on the fourth quarter";
        } else if (dot.getY() < 0 && dot.getX() < 0) {
            dotLocation = "dot is on the third quarter";
        }
    }

    public String getDotLocation() {
        return dotLocation;
    }

}
