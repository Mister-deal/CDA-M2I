<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="mesFactos[j] PREND_LA_VALEUR maFactorielle(j)"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2lignes="" F2etat="inactif" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" totalBoucles="5000000" epaisseurLigne="2" arrondiAuto="vrai" epaisseurPoint="2" maxBoucle="500000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions">
        <item algoitem="FONCTION maFactorielle(nb)" code="201#maFactorielle#nb">
            <item algoitem="VARIABLES_FONCTION" code="202#declarationsvariablesfonction">
                <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
                <item algoitem="result EST_DU_TYPE NOMBRE" code="1#NOMBRE#result"/>
            </item>
            <item algoitem="DEBUT_FONCTION" code="203#debutfonction"/>
            <item algoitem="SI (nb == 0 || nb == 1) ALORS" code="6#nb == 0 || nb == 1">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="RENVOYER 1" code="205#1"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="result PREND_LA_VALEUR 1" code="5#result#1#pasliste"/>
            <item algoitem="POUR i ALLANT_DE 1 A nb" code="12#i#1#nb">
                <item algoitem="DEBUT_POUR" code="13#debutpour"/>
                <item algoitem="result PREND_LA_VALEUR result * i" code="5#result#result * i#pasliste"/>
                <item algoitem="FIN_POUR" code="14#finpour"/>
            </item>
            <item algoitem="RENVOYER result" code="205#result"/>
            <item algoitem="FIN_FONCTION" code="204#finfonction"/>
        </item>
    </item>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nbFactos EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbFactos"/>
        <item algoitem="j EST_DU_TYPE NOMBRE" code="1#NOMBRE#j"/>
        <item algoitem="mesFactos EST_DU_TYPE LISTE" code="1#LISTE#mesFactos"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Veuillez donner un nombre strictement positif: &quot;" code="4#Veuillez donner un nombre strictement positif: #0"/>
        <item algoitem="LIRE nbFactos" code="2#nbFactos#pasliste"/>
        <item algoitem="POUR j ALLANT_DE 0 A nbFactos" code="12#j#0#nbFactos">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="mesFactos[j] PREND_LA_VALEUR maFactorielle(j)" code="5#mesFactos#maFactorielle(j)#j"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;Mes factorielles : [&quot;" code="4#Mes factorielles : [#0"/>
        <item algoitem="POUR j ALLANT_DE 0 A nbFactos - 1" code="12#j#0#nbFactos - 1">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHER mesFactos[j]" code="3#mesFactos#0#j"/>
            <item algoitem="AFFICHER &quot;, &quot;" code="4#, #0"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER mesFactos[nbFactos]" code="3#mesFactos#0#nbFactos"/>
        <item algoitem="AFFICHER &quot;]&quot;" code="4#]#1"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
