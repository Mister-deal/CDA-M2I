<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;nbA vaut &quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2etat="inactif" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8" maxBoucle="500000" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nbA" algoitem="nbA EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbB" algoitem="nbB EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#temp" algoitem="temp EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#nbA#10#pasliste" algoitem="nbA PREND_LA_VALEUR 10"/>
        <item code="5#nbB#30#pasliste" algoitem="nbB PREND_LA_VALEUR 30"/>
        <item code="4#nbA vaut #0" algoitem="AFFICHER &quot;nbA vaut &quot;"/>
        <item code="3#nbA#1#pasliste" algoitem="AFFICHER nbA"/>
        <item code="4#nbB vaut #0" algoitem="AFFICHER &quot;nbB vaut &quot;"/>
        <item code="3#nbB#1#pasliste" algoitem="AFFICHER nbB"/>
        <item code="5#temp#nbA#pasliste" algoitem="temp PREND_LA_VALEUR nbA"/>
        <item code="5#nbA#nbB#pasliste" algoitem="nbA PREND_LA_VALEUR nbB"/>
        <item code="5#nbB#temp#pasliste" algoitem="nbB PREND_LA_VALEUR temp"/>
        <item code="4#------ ECHANGE -------#1" algoitem="AFFICHER &quot;------ ECHANGE -------&quot;"/>
        <item code="4#nbA vaut #0" algoitem="AFFICHER &quot;nbA vaut &quot;"/>
        <item code="3#nbA#1#pasliste" algoitem="AFFICHER nbA"/>
        <item code="4#nbB vaut #0" algoitem="AFFICHER &quot;nbB vaut &quot;"/>
        <item code="3#nbB#1#pasliste" algoitem="AFFICHER nbB"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
