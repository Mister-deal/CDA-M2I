<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;n'est pas divisible par 3...&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2etat="inactif" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8" maxBoucle="500000" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nbA" algoitem="nbA EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Veuillez entrer un nombre / chiffre : #0" algoitem="AFFICHER &quot;Veuillez entrer un nombre / chiffre : &quot;"/>
        <item code="2#nbA#pasliste" algoitem="LIRE nbA"/>
        <item code="4#Le nombre / chiffre #0" algoitem="AFFICHER &quot;Le nombre / chiffre &quot;"/>
        <item code="3#nbA#0#pasliste" algoitem="AFFICHER nbA"/>
        <item code="6#nbA % 3 == 0" algoitem="SI (nbA % 3 == 0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4# est divisible par 3 !#1" algoitem="AFFICHER &quot; est divisible par 3 !&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#n'est pas divisible par 3...#1" algoitem="AFFICHER &quot;n'est pas divisible par 3...&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
