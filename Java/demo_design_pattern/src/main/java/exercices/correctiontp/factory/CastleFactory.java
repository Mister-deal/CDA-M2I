package exercices.correctiontp.factory;

import exercices.correctiontp.builder.BuildingBuilder;
import exercices.correctiontp.builder.CastleBuilder;
import exercices.correctiontp.entity.Building;
import exercices.correctiontp.entity.Castle;

public class CastleFactory extends BuildingFactory {
    @Override
    public Building createBuilding(BuildingBuilder builder) {
        //return new Castle((CastleBuilder) builder);
        return builder.build();
    }
}
