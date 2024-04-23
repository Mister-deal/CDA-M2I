<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHERCALCUL round(somme / (nbNotes - 1) * 10) / 10" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2defaut="" F2lignes="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" nbDecimales="8" maxBoucle="500000" totalAffichages="1000" epaisseurPoint="2" totalBoucles="5000000" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="noteSaisie EST_DU_TYPE NOMBRE" code="1#NOMBRE#noteSaisie"/>
        <item algoitem="noteMax EST_DU_TYPE NOMBRE" code="1#NOMBRE#noteMax"/>
        <item algoitem="noteMin EST_DU_TYPE NOMBRE" code="1#NOMBRE#noteMin"/>
        <item algoitem="somme EST_DU_TYPE NOMBRE" code="1#NOMBRE#somme"/>
        <item algoitem="nbNotes EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbNotes"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="noteMax PREND_LA_VALEUR exp(100)*-1" code="5#noteMax#exp(100)*-1#pasliste"/>
        <item algoitem="noteMin PREND_LA_VALEUR exp(100)" code="5#noteMin#exp(100)#pasliste"/>
        <item algoitem="nbNotes PREND_LA_VALEUR 1" code="5#nbNotes#1#pasliste"/>
        <item algoitem="TANT_QUE (noteSaisie != -1) FAIRE" code="15#noteSaisie != -1">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER &quot;Veuillez entrer la note n°&quot;" code="4#Veuillez entrer la note n°#0"/>
            <item algoitem="AFFICHER nbNotes" code="3#nbNotes#0#pasliste"/>
            <item algoitem="AFFICHER &quot; (entrez -1 pour stopper la saisie) : &quot;" code="4# (entrez -1 pour stopper la saisie) : #0"/>
            <item algoitem="LIRE noteSaisie" code="2#noteSaisie#pasliste"/>
            <item algoitem="SI (noteSaisie != -1) ALORS" code="6#noteSaisie != -1">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="SI (noteSaisie > noteMax) ALORS" code="6#noteSaisie > noteMax">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="noteMax PREND_LA_VALEUR noteSaisie" code="5#noteMax#noteSaisie#pasliste"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                </item>
                <item algoitem="SI (noteSaisie &lt; noteMin) ALORS" code="6#noteSaisie &lt; noteMin">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="noteMin PREND_LA_VALEUR noteSaisie" code="5#noteMin#noteSaisie#pasliste"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                </item>
                <item algoitem="somme PREND_LA_VALEUR somme + noteSaisie" code="5#somme#somme + noteSaisie#pasliste"/>
                <item algoitem="nbNotes PREND_LA_VALEUR nbNotes + 1" code="5#nbNotes#nbNotes + 1#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="SI (nbNotes > 1) ALORS" code="6#nbNotes > 1">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="TANT_QUE (noteSaisie != 0) FAIRE" code="15#noteSaisie != 0">
                <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
                <item algoitem="AFFICHER &quot;\n--- MENU ---&quot;" code="4#\n--- MENU ---#1"/>
                <item algoitem="AFFICHER &quot;1. Afficher la note la plus grande&quot;" code="4#1. Afficher la note la plus grande#1"/>
                <item algoitem="AFFICHER &quot;2. Afficher la note la plus petite&quot;" code="4#2. Afficher la note la plus petite#1"/>
                <item algoitem="AFFICHER &quot;3. Afficher la moyenne&quot;" code="4#3. Afficher la moyenne#1"/>
                <item algoitem="AFFICHER &quot;0. Quitter le programme&quot;" code="4#0. Quitter le programme#1"/>
                <item algoitem="AFFICHER &quot;\nVotre choix : &quot;" code="4#\nVotre choix : #0"/>
                <item algoitem="LIRE noteSaisie" code="2#noteSaisie#pasliste"/>
                <item algoitem="SI (noteSaisie == 1) ALORS" code="6#noteSaisie == 1">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;La plus grande note est &quot;" code="4#La plus grande note est #0"/>
                    <item algoitem="AFFICHER noteMax" code="3#noteMax#1#pasliste"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="SI (noteSaisie == 2) ALORS" code="6#noteSaisie == 2">
                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                            <item algoitem="AFFICHER &quot;La plus petite note est &quot;" code="4#La plus petite note est #0"/>
                            <item algoitem="AFFICHER noteMin" code="3#noteMin#1#pasliste"/>
                            <item algoitem="FIN_SI" code="8#finsi"/>
                            <item algoitem="SINON" code="9#sinon">
                                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                <item algoitem="SI (noteSaisie == 3 ) ALORS" code="6#noteSaisie == 3 ">
                                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                    <item algoitem="AFFICHER &quot;La moyenne des notes est &quot;" code="4#La moyenne des notes est #0"/>
                                    <item algoitem="AFFICHERCALCUL round(somme / (nbNotes - 1) * 10) / 10" code="20#round(somme / (nbNotes - 1) * 10) / 10#1"/>
                                    <item algoitem="FIN_SI" code="8#finsi"/>
                                    <item algoitem="SINON" code="9#sinon">
                                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                        <item algoitem="AFFICHER &quot;Merci, au revoir.&quot;" code="4#Merci, au revoir.#1"/>
                                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                                    </item>
                                </item>
                                <item algoitem="FIN_SINON" code="11#finsinon"/>
                            </item>
                        </item>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
            </item>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="AFFICHER &quot;Aucune note n'a été entrée...Fin du programme.&quot;" code="4#Aucune note n'a été entrée...Fin du programme.#1"/>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
