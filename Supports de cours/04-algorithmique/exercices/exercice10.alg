<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;%&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2para="" F2defaut="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" totalBoucles="5000000" arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" epaisseurPoint="2" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#taux" algoitem="taux EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbAnnees" algoitem="nbAnnees EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Veuillez entrer le taux (en %) : #0" algoitem="AFFICHER &quot;Veuillez entrer le taux (en %) : &quot;"/>
        <item code="2#taux#pasliste" algoitem="LIRE taux"/>
        <item code="5#taux#taux / 100#pasliste" algoitem="taux PREND_LA_VALEUR taux / 100"/>
        <item code="5#nbAnnees#0#pasliste" algoitem="nbAnnees PREND_LA_VALEUR 0"/>
        <item code="15#pow(1 + taux, nbAnnees) &lt; 2" algoitem="TANT_QUE (pow(1 + taux, nbAnnees) &lt; 2) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#nbAnnees#nbAnnees + 1#pasliste" algoitem="nbAnnees PREND_LA_VALEUR nbAnnees + 1"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4#Il vous faudra #0" algoitem="AFFICHER &quot;Il vous faudra &quot;"/>
        <item code="3#nbAnnees#0#pasliste" algoitem="AFFICHER nbAnnees"/>
        <item code="4# année(s) pour doubler votre capital avec un taux de #0" algoitem="AFFICHER &quot; année(s) pour doubler votre capital avec un taux de &quot;"/>
        <item code="20#taux * 100#0" algoitem="AFFICHERCALCUL taux * 100"/>
        <item code="4#%#1" algoitem="AFFICHER &quot;%&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
