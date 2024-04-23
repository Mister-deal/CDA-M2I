<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="LIRE n"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2etat="inactif" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param nbDecimales="8" totalAffichages="1000" totalBoucles="5000000" arrondiAuto="vrai" epaisseurPoint="2" epaisseurLigne="2" maxBoucle="500000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#c" algoitem="c EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#n" algoitem="n EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#t" algoitem="t EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Quel est le montant initial (en euros) ? #0" algoitem="AFFICHER &quot;Quel est le montant initial (en euros) ? &quot;"/>
        <item code="2#c#pasliste" algoitem="LIRE c"/>
        <item code="4#Quel est le taux (en poucentage) ? #0" algoitem="AFFICHER &quot;Quel est le taux (en poucentage) ? &quot;"/>
        <item code="2#t#pasliste" algoitem="LIRE t"/>
        <item code="4#Pendant combien d'années ? #0" algoitem="AFFICHER &quot;Pendant combien d'années ? &quot;"/>
        <item code="2#n#pasliste" algoitem="LIRE n"/>
        <item code="4#Pour un montant initial de #0" algoitem="AFFICHER &quot;Pour un montant initial de &quot;"/>
        <item code="3#c#0#pasliste" algoitem="AFFICHER c"/>
        <item code="4# euros, placé à un taux de #0" algoitem="AFFICHER &quot; euros, placé à un taux de &quot;"/>
        <item code="3#t#0#pasliste" algoitem="AFFICHER t"/>
        <item code="4#% pendant #0" algoitem="AFFICHER &quot;% pendant &quot;"/>
        <item code="3#n#0#pasliste" algoitem="AFFICHER n"/>
        <item code="4# années,\non aura à la fin un capital final de #0" algoitem="AFFICHER &quot; années,\non aura à la fin un capital final de &quot;"/>
        <item code="20#round(c * pow((1 + t/100), n) * 100) / 100#0" algoitem="AFFICHERCALCUL round(c * pow((1 + t/100), n) * 100) / 100"/>
        <item code="4# euros.#1" algoitem="AFFICHER &quot; euros.&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
