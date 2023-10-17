import { useSelector } from 'react-redux'
import './App.css'
import SignForm from './components/auth/SignForm'
import RecipeForm from './components/recipeList/RecipeForm'

function App() {
  const user = useSelector(state => state.auth.user)
  return (
    <>
    {
      user ?
      <RecipeForm user={user} />
      :
      <SignForm />
    }
    </>
  )
}

export default App
