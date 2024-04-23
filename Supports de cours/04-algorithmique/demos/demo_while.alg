<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER age"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" nbDecimales="8" totalBoucles="5000000" epaisseurLigne="2" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#age" algoitem="age EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Quel est votre age ? #0" algoitem="AFFICHER &quot;Quel est votre age ? &quot;"/>
        <item code="2#age#pasliste" algoitem="LIRE age"/>
        <item code="15#age &lt; 18" algoitem="TANT_QUE (age &lt; 18) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="4#C'est votre anniversaire, vous avez maintenant #0" algoitem="AFFICHER &quot;C'est votre anniversaire, vous avez maintenant &quot;"/>
            <item code="3#age#0#pasliste" algoitem="AFFICHER age"/>
            <item code="4# ans !#1" algoitem="AFFICHER &quot; ans !&quot;"/>
            <item code="5#age#age + 1#pasliste" algoitem="age PREND_LA_VALEUR age + 1"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="3#age#0#pasliste" algoitem="AFFICHER age"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
