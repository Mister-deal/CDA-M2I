<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHERCALCUL 2023 - age" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2etat="inactif" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8" maxBoucle="500000" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#CHAINE#prenom" algoitem="prenom EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#nom" algoitem="nom EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#age" algoitem="age EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Quel est votre prénom ? #0" algoitem="AFFICHER &quot;Quel est votre prénom ? &quot;"/>
        <item code="2#prenom#pasliste" algoitem="LIRE prenom"/>
        <item code="4#Quel est votre nom de famille ? #0" algoitem="AFFICHER &quot;Quel est votre nom de famille ? &quot;"/>
        <item code="2#nom#pasliste" algoitem="LIRE nom"/>
        <item code="4#Quel est votre âge ? #0" algoitem="AFFICHER &quot;Quel est votre âge ? &quot;"/>
        <item code="2#age#pasliste" algoitem="LIRE age"/>
        <item code="4#Merci #0" algoitem="AFFICHER &quot;Merci &quot;"/>
        <item code="3#prenom#0#pasliste" algoitem="AFFICHER prenom"/>
        <item code="4# #0" algoitem="AFFICHER &quot; &quot;"/>
        <item code="3#nom#0#pasliste" algoitem="AFFICHER nom"/>
        <item code="4#, vous avez #0" algoitem="AFFICHER &quot;, vous avez &quot;"/>
        <item code="3#age#0#pasliste" algoitem="AFFICHER age"/>
        <item code="4# an(s). Vous êtes sans doute né en #0" algoitem="AFFICHER &quot; an(s). Vous êtes sans doute né en &quot;"/>
        <item code="20#2023 - age#0" algoitem="AFFICHERCALCUL 2023 - age"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
