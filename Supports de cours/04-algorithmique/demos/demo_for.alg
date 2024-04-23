<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="POUR i ALLANT_DE 1 A 5"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" nbDecimales="8" totalBoucles="5000000" epaisseurLigne="2" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#age" algoitem="age EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Quel est votre age ? #0" algoitem="AFFICHER &quot;Quel est votre age ? &quot;"/>
        <item code="2#age#pasliste" algoitem="LIRE age"/>
        <item code="12#i#1#5" algoitem="POUR i ALLANT_DE 1 A 5">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="4#C'est votre anniversaire, vous avez maintenant #0" algoitem="AFFICHER &quot;C'est votre anniversaire, vous avez maintenant &quot;"/>
            <item code="3#age#0#pasliste" algoitem="AFFICHER age"/>
            <item code="4# ans !#1" algoitem="AFFICHER &quot; ans !&quot;"/>
            <item code="5#age#age + 1#pasliste" algoitem="age PREND_LA_VALEUR age + 1"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="3#age#1#pasliste" algoitem="AFFICHER age"/>
        <item code="3#i#0#pasliste" algoitem="AFFICHER i"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
