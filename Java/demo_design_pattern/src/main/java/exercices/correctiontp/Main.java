package exercices.correctiontp;

import exercices.correctiontp.builder.CastleBuilder;
import exercices.correctiontp.entity.Building;
import exercices.correctiontp.factory.CastleFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Building> buildings = new ArrayList<>();
        CastleFactory castleFactory = new CastleFactory();

        //Ajouter un castle
        buildings.add(castleFactory.createBuilding(new CastleBuilder()
                .name("castle 1")
                .size(10)
                .style("Big One")


        ));

    }
}
