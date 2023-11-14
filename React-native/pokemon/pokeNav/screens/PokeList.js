import React, { useEffect, useState } from 'react';
import { View, Text, FlatList, StyleSheet } from 'react-native';
import axios from 'axios';
import PokeCard from '../components/PokeCard';





const PokeList = () => {
    const [pokemons, setPokemons] = useState([]);
    const api = 'https://pokeapi.co/api/v2/pokemon?offset=10&limit=50'
    const [loading, setLoading] = useState(true)

    useEffect(() => {
        axios
        .get(api)
        .then(resp => {
          const pokeDetails = resp.data.results.map(item => axios.get(item.url),
          );
          Promise.all(pokeDetails)
          .then(response => {
            const sortedPoke = response.map(res => ({
              img: res.data.sprites.front_default,
              name:res.data.name,
              type: res.data.types,
              id: res.data.id,
            }))
            .sort((a, b) => a.id - b.id);
            setPokemons(sortedPoke);
          })
          console.log("pokedetails", pokeDetails);
        })
        .catch(error => console.error(error));
      }, [])

      useEffect(() => {
        if(pokemons.length == 50){
          setLoading(false)
        }
      }, [pokemons]);

if(loading){
  return <Text>chargement</Text>
}

    return (
        <View>
          <Text>Liste des pokémons</Text>
          <FlatList
          numColumns={2}
            data={pokemons}
            renderItem={({item}) => {
                return(
                    <PokeCard
                    pokemon={item}>
                    </PokeCard>
                )
            }}
            keyExtractor={(item, index) => {
              return index
          }}
          />
        </View>
      );
}


export default PokeList