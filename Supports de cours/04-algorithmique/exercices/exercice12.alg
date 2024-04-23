<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="LIRE nbMax"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalBoucles="5000000" arrondiAuto="vrai" totalAffichages="1000" maxBoucle="500000" nbDecimales="8" epaisseurPoint="2" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nbMax" algoitem="nbMax EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbUser" algoitem="nbUser EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Veuillez entrer le nombre n°1 : #0" algoitem="AFFICHER &quot;Veuillez entrer le nombre n°1 : &quot;"/>
        <item code="2#nbMax#pasliste" algoitem="LIRE nbMax"/>
        <item code="12#i#2#6" algoitem="POUR i ALLANT_DE 2 A 6">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="4#Veuillez entrer le nombre n°#0" algoitem="AFFICHER &quot;Veuillez entrer le nombre n°&quot;"/>
            <item code="3#i#0#pasliste" algoitem="AFFICHER i"/>
            <item code="4# : #0" algoitem="AFFICHER &quot; : &quot;"/>
            <item code="2#nbUser#pasliste" algoitem="LIRE nbUser"/>
            <item code="6#nbUser > nbMax" algoitem="SI (nbUser > nbMax) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#nbMax#nbUser#pasliste" algoitem="nbMax PREND_LA_VALEUR nbUser"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="4#Le nombre maximal était : #0" algoitem="AFFICHER &quot;Le nombre maximal était : &quot;"/>
        <item code="3#nbMax#1#pasliste" algoitem="AFFICHER nbMax"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
