package exercices.correctiontp.factory;

import exercices.correctiontp.builder.BuildingBuilder;
import exercices.correctiontp.entity.Building;

public abstract class BuildingFactory {
    abstract Building createBuilding(BuildingBuilder builder);
}
