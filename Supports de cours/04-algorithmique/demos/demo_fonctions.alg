<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER monNombre"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurPoint="2" epaisseurLigne="2" maxBoucle="500000" totalAffichages="1000" nbDecimales="8" totalBoucles="5000000" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES">
        <item code="201#maFonctionAvecParams#a, b" algoitem="FONCTION maFonctionAvecParams(a, b)">
            <item code="202#declarationsvariablesfonction" algoitem="VARIABLES_FONCTION">
                <item code="1#NOMBRE#saisieDansFonction" algoitem="saisieDansFonction EST_DU_TYPE NOMBRE"/>
            </item>
            <item code="203#debutfonction" algoitem="DEBUT_FONCTION"/>
            <item code="5#saisieDansFonction#-1#pasliste" algoitem="saisieDansFonction PREND_LA_VALEUR -1"/>
            <item code="15#saisieDansFonction &lt; a || saisieDansFonction > b" algoitem="TANT_QUE (saisieDansFonction &lt; a || saisieDansFonction > b) FAIRE">
                <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
                <item code="4#Veuillez entrer un nombre entre #0" algoitem="AFFICHER &quot;Veuillez entrer un nombre entre &quot;"/>
                <item code="20#a#0" algoitem="AFFICHERCALCUL a"/>
                <item code="4# et #0" algoitem="AFFICHER &quot; et &quot;"/>
                <item code="20#b#0" algoitem="AFFICHERCALCUL b"/>
                <item code="4# : #0" algoitem="AFFICHER &quot; : &quot;"/>
                <item code="2#saisieDansFonction#pasliste" algoitem="LIRE saisieDansFonction"/>
                <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
            </item>
            <item code="205#saisieDansFonction" algoitem="RENVOYER saisieDansFonction"/>
            <item code="204#finfonction" algoitem="FIN_FONCTION"/>
        </item>
        <item code="201#maProcedureAvecParams#nbProcB" algoitem="FONCTION maProcedureAvecParams(nbProcB)">
            <item code="202#declarationsvariablesfonction" algoitem="VARIABLES_FONCTION">
                <item code="1#NOMBRE#varProcB" algoitem="varProcB EST_DU_TYPE NOMBRE"/>
            </item>
            <item code="203#debutfonction" algoitem="DEBUT_FONCTION"/>
            <item code="12#varProcB#1#5" algoitem="POUR varProcB ALLANT_DE 1 A 5">
                <item code="13#debutpour" algoitem="DEBUT_POUR"/>
                <item code="4#Je suis dans la boucle : #0" algoitem="AFFICHER &quot;Je suis dans la boucle : &quot;"/>
                <item code="20#varProcB * nbProcB#1" algoitem="AFFICHERCALCUL varProcB * nbProcB"/>
                <item code="14#finpour" algoitem="FIN_POUR"/>
            </item>
            <item code="204#finfonction" algoitem="FIN_FONCTION"/>
        </item>
        <item code="201#maProcedureSansParams# " algoitem="FONCTION maProcedureSansParams( )">
            <item code="202#declarationsvariablesfonction" algoitem="VARIABLES_FONCTION">
                <item code="1#NOMBRE#varProcA" algoitem="varProcA EST_DU_TYPE NOMBRE"/>
            </item>
            <item code="203#debutfonction" algoitem="DEBUT_FONCTION"/>
            <item code="12#varProcA#1#5" algoitem="POUR varProcA ALLANT_DE 1 A 5">
                <item code="13#debutpour" algoitem="DEBUT_POUR"/>
                <item code="4#Je suis dans une boucle : #0" algoitem="AFFICHER &quot;Je suis dans une boucle : &quot;"/>
                <item code="3#varProcA#1#pasliste" algoitem="AFFICHER varProcA"/>
                <item code="14#finpour" algoitem="FIN_POUR"/>
            </item>
            <item code="204#finfonction" algoitem="FIN_FONCTION"/>
        </item>
    </item>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#monNombre" algoitem="monNombre EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Je débute le programme#1" algoitem="AFFICHER &quot;Je débute le programme&quot;"/>
        <item code="206#maProcedureSansParams()" algoitem="APPELER_FONCTION maProcedureSansParams()"/>
        <item code="4#------------------#1" algoitem="AFFICHER &quot;------------------&quot;"/>
        <item code="206#maProcedureSansParams()" algoitem="APPELER_FONCTION maProcedureSansParams()"/>
        <item code="4#Je termine le programme#1" algoitem="AFFICHER &quot;Je termine le programme&quot;"/>
        <item code="4#-------------#1" algoitem="AFFICHER &quot;-------------&quot;"/>
        <item code="4#Je débute le programme#1" algoitem="AFFICHER &quot;Je débute le programme&quot;"/>
        <item code="206#maProcedureAvecParams(1)" algoitem="APPELER_FONCTION maProcedureAvecParams(1)"/>
        <item code="4#------------------#1" algoitem="AFFICHER &quot;------------------&quot;"/>
        <item code="206#maProcedureAvecParams(5)" algoitem="APPELER_FONCTION maProcedureAvecParams(5)"/>
        <item code="4#Je termine le programme#1" algoitem="AFFICHER &quot;Je termine le programme&quot;"/>
        <item code="4#-------------#1" algoitem="AFFICHER &quot;-------------&quot;"/>
        <item code="4#Je débute le programme#1" algoitem="AFFICHER &quot;Je débute le programme&quot;"/>
        <item code="5#monNombre#maFonctionAvecParams(1, 10)#pasliste" algoitem="monNombre PREND_LA_VALEUR maFonctionAvecParams(1, 10)"/>
        <item code="4#Vous avez entré le nombre : #0" algoitem="AFFICHER &quot;Vous avez entré le nombre : &quot;"/>
        <item code="3#monNombre#1#pasliste" algoitem="AFFICHER monNombre"/>
        <item code="4#------------------#1" algoitem="AFFICHER &quot;------------------&quot;"/>
        <item code="5#monNombre#maFonctionAvecParams(20, 50)#pasliste" algoitem="monNombre PREND_LA_VALEUR maFonctionAvecParams(20, 50)"/>
        <item code="4#Je termine le programme#1" algoitem="AFFICHER &quot;Je termine le programme&quot;"/>
        <item code="4#Vous avez entré le nombre : #0" algoitem="AFFICHER &quot;Vous avez entré le nombre : &quot;"/>
        <item code="3#monNombre#1#pasliste" algoitem="AFFICHER monNombre"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
