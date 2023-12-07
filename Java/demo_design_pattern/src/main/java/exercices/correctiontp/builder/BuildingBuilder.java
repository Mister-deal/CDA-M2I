package exercices.correctiontp.builder;

import exercices.correctiontp.entity.Building;

public abstract class BuildingBuilder {
    public abstract BuildingBuilder name(String name);
    public abstract BuildingBuilder style(String style);
    public abstract BuildingBuilder size(int size);

    public abstract Building build();
}
