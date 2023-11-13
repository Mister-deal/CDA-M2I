import { NavigationContainer } from "@react-navigation/native";
import Home from "./screens/Home.js";
import PokeList from "./screens/PokeList.js";

const { createNativeStackNavigator } = require("@react-navigation/native-stack");






const Stack = createNativeStackNavigator()

export default function App() {
  return(
    <NavigationContainer>
      <Stack.Navigator initialRouteName="Home">
        <Stack.Screen name="Home" component={Home} />
        <Stack.Screen name="PokeList" component={PokeList} />
        {/* <Stack.Screen name="PokeDex" component={PokeDex} /> */}
      </Stack.Navigator>
    </NavigationContainer>
  )
}