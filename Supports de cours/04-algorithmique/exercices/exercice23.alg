<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="DEBUT_POUR" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" totalAffichages="1000" totalBoucles="5000000" maxBoucle="500000" nbDecimales="8" epaisseurPoint="2" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions">
        <item algoitem="FONCTION maFactorielle(nb)" code="201#maFactorielle#nb">
            <item algoitem="VARIABLES_FONCTION" code="202#declarationsvariablesfonction">
                <item algoitem="prod EST_DU_TYPE NOMBRE" code="1#NOMBRE#prod"/>
                <item algoitem="iFunc EST_DU_TYPE NOMBRE" code="1#NOMBRE#iFunc"/>
            </item>
            <item algoitem="DEBUT_FONCTION" code="203#debutfonction"/>
            <item algoitem="prod PREND_LA_VALEUR 1" code="5#prod#1#pasliste"/>
            <item algoitem="POUR iFunc ALLANT_DE 1 A nb" code="12#iFunc#1#nb">
                <item algoitem="DEBUT_POUR" code="13#debutpour"/>
                <item algoitem="prod PREND_LA_VALEUR prod * iFunc" code="5#prod#prod * iFunc#pasliste"/>
                <item algoitem="FIN_POUR" code="14#finpour"/>
            </item>
            <item algoitem="RENVOYER prod" code="205#prod"/>
            <item algoitem="FIN_FONCTION" code="204#finfonction"/>
        </item>
    </item>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nbSaisie EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbSaisie"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="mesFactos EST_DU_TYPE LISTE" code="1#LISTE#mesFactos"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Veuillez entrer un nombre entier strictement positif : &quot;" code="4#Veuillez entrer un nombre entier strictement positif : #0"/>
        <item algoitem="LIRE nbSaisie" code="2#nbSaisie#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 0 A nbSaisie" code="12#i#0#nbSaisie">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="mesFactos[i] PREND_LA_VALEUR maFactorielle(i)" code="5#mesFactos#maFactorielle(i)#i"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;\nMes factorielles : [&quot;" code="4#\nMes factorielles : [#0"/>
        <item algoitem="POUR i ALLANT_DE 0 A nbSaisie - 1" code="12#i#0#nbSaisie - 1">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHER mesFactos[i]" code="3#mesFactos#0#i"/>
            <item algoitem="AFFICHER &quot;, &quot;" code="4#, #0"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER mesFactos[nbSaisie]" code="3#mesFactos#0#nbSaisie"/>
        <item algoitem="AFFICHER &quot;]&quot;" code="4#]#1"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
