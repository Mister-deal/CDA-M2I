<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="affichage PREND_LA_VALEUR affichage + nbUser + &quot; = &quot; + sum" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2etat="inactif" F2lignes="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" maxBoucle="500000" epaisseurPoint="2" arrondiAuto="vrai" epaisseurLigne="2" totalBoucles="5000000" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nbUser" algoitem="nbUser EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#sum" algoitem="sum EST_DU_TYPE NOMBRE"/>
        <item code="1#CHAINE#affichage" algoitem="affichage EST_DU_TYPE CHAINE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Veuillez entrer un nombre positif supérieur à 1 : #0" algoitem="AFFICHER &quot;Veuillez entrer un nombre positif supérieur à 1 : &quot;"/>
        <item code="2#nbUser#pasliste" algoitem="LIRE nbUser"/>
        <item code="12#i#1#nbUser - 1" algoitem="POUR i ALLANT_DE 1 A nbUser - 1">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#sum#sum + i#pasliste" algoitem="sum PREND_LA_VALEUR sum + i"/>
            <item code="5#affichage#affichage + i + &quot; + &quot;#pasliste" algoitem="affichage PREND_LA_VALEUR affichage + i + &quot; + &quot;"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="5#sum#sum + nbUser#pasliste" algoitem="sum PREND_LA_VALEUR sum + nbUser"/>
        <item code="5#affichage#affichage + nbUser + &quot; = &quot; + sum#pasliste" algoitem="affichage PREND_LA_VALEUR affichage + nbUser + &quot; = &quot; + sum"/>
        <item code="3#affichage#0#pasliste" algoitem="AFFICHER affichage"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
