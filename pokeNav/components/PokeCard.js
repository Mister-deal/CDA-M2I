const { useNavigation } = require("@react-navigation/native");
import React from 'react';
const { Pressable, View, Text, FlatList, Image, StyleSheet } = require("react-native");



const PokeCard = ({pokemon}) => {
    console.log(pokemon);
    const navigation = useNavigation();
    return(
        <Pressable
        style={[styles.card, { backgroundColor: colors[pokemon.type[0].type.name.toLowerCase()] || '#e0e0e0' }]}
        onPress={() => navigation.navigate("PokemonDetail", {
            name: pokemon.name,
            id: pokemon.id
            })}>
            <View style={styles.cardContent}>
                <Text style={styles.name}>{pokemon.name}</Text>
                <FlatList
                    data={pokemon.type}
                    renderItem={({item}) => {
                        return <Text style={[styles.type, { backgroundColor: colors[item.type.name.toLowerCase()] || '#555555' }]}>{item.type.name}</Text>
                    }}
                    keyExtractor={(item, index) => {
                        return index
                    }}
                    />
            </View>
                <View style={styles.imageContainer}>
                    <Image height={90} width={90} source={{uri: pokemon.img}}/>
                </View>
        </Pressable>
    )
}
const colors = {
    normal: '#A8A878',
    fighting: '#C03028',
    flying: '#A890F0',
    poison: '#A040A0',
    ground: '#E0C068',
    rock: '#B8A038',
    bug: '#A8B820',
    ghost: '#705898',
    steel: '#B8B8D0',
    fire: '#F08030',
    water: '#6890F0',
    grass: '#78C850',
    electric: '#F8D030',
    psychic: '#F85888',
    ice: '#98D8D8',
    dragon: '#7038F8',
    dark: '#705848',
    fairy: '#EE99AC',
}

const styles = StyleSheet.create({
    card: {
        flex: 0.8,
        backgroundColor: '#e0e0e0',
        margin: 8,
        padding: 16,
        borderRadius: 8,
        flexDirection: 'row',
        justifyContent: 'space-between',
    },
    name: {
      fontSize: 18,
      fontWeight: 'bold',
    },
    data: {
      fontSize: 14,
      fontWeight: "normal"
    },
    imageContainer: {
        marginLeft: 16,
      }
  });
export default PokeCard