<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_ALGORITHME"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2lignes="" F2etat="inactif" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalBoucles="5000000" epaisseurLigne="2" epaisseurPoint="2" maxBoucle="500000" arrondiAuto="vrai" totalAffichages="1000" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nbAnnees" algoitem="nbAnnees EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="15#96809 * pow(1 + 0.0089, nbAnnees) &lt; 120000" algoitem="TANT_QUE (96809 * pow(1 + 0.0089, nbAnnees) &lt; 120000) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#nbAnnees#nbAnnees + 1 #pasliste" algoitem="nbAnnees PREND_LA_VALEUR nbAnnees + 1 "/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4#Il faut #0" algoitem="AFFICHER &quot;Il faut &quot;"/>
        <item code="3#nbAnnees#0#pasliste" algoitem="AFFICHER nbAnnees"/>
        <item code="4# années à la ville de Tourcoing pour atteindre les plus de 120 000 habitants, sachant qu'en 2015 elle avait 96 809 habitants. Nous serons donc en #0" algoitem="AFFICHER &quot; années à la ville de Tourcoing pour atteindre les plus de 120 000 habitants, sachant qu'en 2015 elle avait 96 809 habitants. Nous serons donc en &quot;"/>
        <item code="20#2015 + nbAnnees#0" algoitem="AFFICHERCALCUL 2015 + nbAnnees"/>
        <item code="4#, ce qui fait, depuis l'années 2023 #0" algoitem="AFFICHER &quot;, ce qui fait, depuis l'années 2023 &quot;"/>
        <item code="20#2015 + nbAnnees - 2023 #0" algoitem="AFFICHERCALCUL 2015 + nbAnnees - 2023 "/>
        <item code="4# ans à attendre...#0" algoitem="AFFICHER &quot; ans à attendre...&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
