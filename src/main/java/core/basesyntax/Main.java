package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure figure1 = figureSupplier.getRandomFigure();
        Figure figure2 = figureSupplier.getRandomFigure();
        Figure figure3 = figureSupplier.getRandomFigure();
        Figure figure4 = figureSupplier.getDefaultFigure();
        Figure figure5 = figureSupplier.getDefaultFigure();
        Figure figure6 = figureSupplier.getDefaultFigure();

        Figure[] figures = new Figure[]{figure1, figure2, figure3, figure4, figure5, figure6};

        for (Figure figure : figures) {
            figure.draw();
        }

    }
}
