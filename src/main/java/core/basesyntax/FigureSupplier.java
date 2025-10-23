package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_DIMENSION = 1000;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int typeOfFigure = random.nextInt(FIGURE_COUNT);
        int randInt1 = 1 + random.nextInt(MAX_DIMENSION);
        int randInt2 = 1 + random.nextInt(MAX_DIMENSION);
        int randInt3 = 1 + random.nextInt(MAX_DIMENSION);
        double randDouble = 1 + random.nextDouble() * MAX_DIMENSION;

        switch (typeOfFigure) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), randInt1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), randInt1, randInt2);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), randInt1, randInt2);
            case 3:
                return new Circle(colorSupplier.getRandomColor(), randDouble);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), randInt1,
                        randInt2, randInt3);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name().toLowerCase(), 10);
    }
}
