import React, { useEffect, useState } from 'react';
import { View, Text, FlatList, StyleSheet, TouchableOpacity } from 'react-native';
import axios from 'axios';





const PokeList = ({ navigation }) => {
    const [pokemonList, setPokemonList] = useState([]);
    const api = 'https://pokeapi.co/api/v2/pokemon?offset=10&limit=50'
    const apiUrl = 'https://pokeapi.co/api/v2/pokemon/'
    
    useEffect(() => {
        axios.get(api)
        .then(response => setPokemonList(response.data.results))
        .catch(error => console.error(error));
      }, [])
    console.log(api);
    console.log(pokemonList);

    // function fetchPokemon() {
    //   const pokemonData = [];
    //   for (let index = 10; index < 51; index++) {
    //     const pokemonInfo = axios.get(apiUrl + index);
    //     if (pokemonInfo){
    //       pokemonData.push(pokemonInfo)
    //     }
    //   }
    // }


    return (
        <View>
          <Text>Liste des pokémons</Text>
          <FlatList
            data={pokemonList}
            renderItem={itemData => {
                return(
                    <TouchableOpacity
                    style={styles.card}
                    onPress={() => {
                      // axios.get(api.url)
                      // fetchPokemon()
                      navigation.navigate('PokemonDetail', { pokemon: itemData.item.name })
                    }}
                    >
                    <Text style={styles.name}>{itemData.item.name}</Text>
                </TouchableOpacity>
                )
            }}
            keyExtractor={item => item.name}
          />
        </View>
      );
}

const styles = StyleSheet.create({
    card: {
      backgroundColor: '#e0e0e0',
      margin: 8,
      padding: 16,
      borderRadius: 8,
    },
    name: {
      fontSize: 18,
      fontWeight: 'bold',
    },
  });

export default PokeList