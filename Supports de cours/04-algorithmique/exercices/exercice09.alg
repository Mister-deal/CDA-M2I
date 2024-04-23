<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;Merci, bonne journée !&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" nbDecimales="8" totalBoucles="5000000" epaisseurLigne="2" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#entreeUtilisateur" algoitem="entreeUtilisateur EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#entreeUtilisateur#0#pasliste" algoitem="entreeUtilisateur PREND_LA_VALEUR 0"/>
        <item code="15#entreeUtilisateur &lt; 1 || entreeUtilisateur > 3" algoitem="TANT_QUE (entreeUtilisateur &lt; 1 || entreeUtilisateur > 3) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="4#Veuillez entrer un nombre entre 1 et 3 compris : #0" algoitem="AFFICHER &quot;Veuillez entrer un nombre entre 1 et 3 compris : &quot;"/>
            <item code="2#entreeUtilisateur#pasliste" algoitem="LIRE entreeUtilisateur"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4#Merci, bonne journée !#0" algoitem="AFFICHER &quot;Merci, bonne journée !&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
