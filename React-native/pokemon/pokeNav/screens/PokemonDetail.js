// PokemonDetail.js
import React, { useEffect, useState } from 'react';
import { View, Text, Image, StyleSheet } from 'react-native';

const PokemonDetail = ({ route }) => {
  const { name, id } = route.params; // Récupérer l'id du Pokémon depuis les paramètres de route
  const [pokemonDetails, setPokemonDetails] = useState(null);
  const [pokemonSpecies, setPokemonSpecies] = useState(null)

  console.log("données id et name", id, name);

  useEffect(() => {
    // Utiliser l'id pour récupérer les détails du Pokémon
    fetch(`https://pokeapi.co/api/v2/pokemon/${id}/`)
      .then(response => response.json())
      .then(data => {setPokemonDetails(data)
        return fetch(`https://pokeapi.co/api/v2/pokemon-species/${id}/`)})
        .then(resp => resp.json())
        .then(Data => {setPokemonSpecies(Data)
        console.log(Data.flavor_text_entries[0]);})
      .catch(error => {
        console.error('Error fetching Pokémon details:', error);
      });
  }, [id]);


//   const description = setPokemonSpecies.flavor_text_entries[0].flavor_text.split("\n").join(" ")
//   console.log("description:", description);
//   const description = pokemonSpecies.flavor_text_entries[0];

  return (
    <View style={styles.container}>
      {pokemonDetails ? (
        <React.Fragment>
          <Text style={styles.name}>{name}</Text>
          <Image
            style={styles.sprite}
            source={{ uri: pokemonDetails.sprites.front_default }}
          />
          <Text style={styles.details}>Weight: {pokemonDetails.weight} kg</Text>
          <Text style={styles.details}>Height: {pokemonDetails.height} m</Text>
          <Text style={styles.name}>Détails</Text>
          <Text style={styles.details}>Description: </Text>
        </React.Fragment>
      ) : (
        <Text>Loading...</Text>
      )}
    </View>
  );
};



const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#f0f0f0',
    alignItems: 'center',
    justifyContent: 'center',
  },
  name: {
    fontSize: 24,
    fontWeight: 'bold',
    marginBottom: 16,
  },
  sprite: {
    width: 200,
    height: 200,
    resizeMode: 'contain',
  },
  details: {
    fontSize: 16,
    marginBottom: 8,
  },
});

export default PokemonDetail;
