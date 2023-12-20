import {View, Text, StyleSheet, Image} from "react-native"



export default function NousConnaitre() {
    const localImage = require('../img/PokéNav.png')
    return(
        <View style={styles.container}>
             <Text style={styles.title}>Description:</Text>
            <Text>PokeNav est bien plus qu'une simple application, c'est ton compagnon essentiel pour explorer le vaste monde des Pokémon. 
                Que tu sois un dresseur chevronné ou que tu commences tout juste ton aventure, PokeNav est là pour t'accompagner à chaque étape de ton voyage Pokémon.</Text>
                <Text style={styles.title}>Fonctionnalités Principales :</Text>
            <Text>
                1.🗺️ Carte Interactive :
                    Explore une carte interactive détaillée, découvre des lieux emblématiques, et repère les Pokémon sauvages à proximité. Ne manque jamais une chance de capturer un Pokémon rare !

                    2.📍 Localisation des PokéStops et Arènes :
                    Trouve facilement les PokéStops et les Arènes autour de toi. Maximise tes récompenses, participe aux combats d'Arènes, et deviens le maître incontesté de ta région.

                    3.📋 Encyclopédie Pokémon :
                    Accède à une encyclopédie complète avec des informations détaillées sur chaque Pokémon. Apprends-en plus sur leurs types, évolutions et caractéristiques pour devenir un expert en la matière.

                    4 Recherche Avancée :
                    Utilise des filtres avancés pour trouver rapidement les Pokémon que tu recherches. Que ce soit par type, par région, ou par rareté, PokeNav te facilite la vie.

                    5 Communauté Pokémon :
                    Rejoins une communauté dynamique de dresseurs. Partage tes découvertes, échange des conseils, et organise des événements Pokémon passionnants avec d'autres joueurs.
                    </Text>
                <Text style={styles.title}>Pourquoi PokeNav ?</Text>
                <Text>PokeNav a été créé avec une passion pour l'univers Pokémon et le désir de fournir une expérience exceptionnelle aux dresseurs du monde entier. Notre équipe dévouée travaille constamment pour améliorer l'application et offrir de nouvelles fonctionnalités pour enrichir ton aventure Pokémon.</Text>
                <View style={styles.containerSide}>
                    <Image style={styles.img} source={localImage}></Image>
                    <Text>Merci pour votre soutien !!</Text>
                </View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        padding: 20,
    },
    containerSide: {
        flex: 1,
        padding: 20,
        justifyContent: "center",
        alignItems: "center"
    },
    title: {
        fontSize: 25,
    },
    img: {
        width: 100,
        height: 100,
        resizeMode: "contain",
    }
})