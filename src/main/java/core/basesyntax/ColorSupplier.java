package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColor = new Random();

    public String getRandomColor() {
        int index = randomColor.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color.name().toLowerCase();
    }
}
