import { NavigationContainer } from "@react-navigation/native";
import Home from "./screens/Home.js";
import PokeList from "./screens/PokeList.js";
import PokemonDetail from "./screens/PokemonDetail.js";
import PokeDex from "./screens/PokeDex.js";
import NousConnaitre from "./screens/NousConnaitre.js";


const { createNativeStackNavigator } = require("@react-navigation/native-stack");






const Stack = createNativeStackNavigator()

export default function App() {
  return(
    <NavigationContainer>
      <Stack.Navigator initialRouteName="Home">
        <Stack.Screen name="Home" component={Home} />
        <Stack.Screen name="PokeList" component={PokeList} />
        <Stack.Screen name="PokemonDetail" component={PokemonDetail} />
        <Stack.Screen name="PokeDex" component={PokeDex} />
        <Stack.Screen name="NousConnaitre" component={NousConnaitre} />
      </Stack.Navigator>
    </NavigationContainer>
  )
}