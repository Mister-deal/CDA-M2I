<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="affichage PREND_LA_VALEUR affichage + i + &quot; &quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" nbDecimales="8" epaisseurLigne="2" arrondiAuto="vrai" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="nbSaisie EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbSaisie"/>
        <item algoitem="affichage EST_DU_TYPE CHAINE" code="1#CHAINE#affichage"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Veuillez entrer un nombre entier supérieur ou égal à 1 : &quot;" code="4#Veuillez entrer un nombre entier supérieur ou égal à 1 : #0"/>
        <item algoitem="LIRE nbSaisie" code="2#nbSaisie#pasliste"/>
        <item algoitem="affichage PREND_LA_VALEUR &quot;&quot;" code="5#affichage#&quot;&quot;#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 1 A nbSaisie" code="12#i#1#nbSaisie">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="affichage PREND_LA_VALEUR affichage + i + &quot; &quot;" code="5#affichage#affichage + i + &quot; &quot;#pasliste"/>
            <item algoitem="AFFICHER affichage" code="3#affichage#1#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
