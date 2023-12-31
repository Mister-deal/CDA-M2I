package exercices.correctiontp.entity;

import exercices.correctiontp.builder.CastleBuilder;

public class Castle extends Building {

    private int size;
    private String style;
    private String name;

    public Castle(CastleBuilder builder) {
        size = builder.getSize();
        style = builder.getStyle();
        name = builder.getName();
    }
}
