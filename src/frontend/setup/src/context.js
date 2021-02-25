import React, { useState, useContext, useEffect } from 'react'
import { useCallback } from 'react'
import {useParams} from 'react-router-dom'

const DRINK_URL = 'http://localhost:8080/api/' + "all"


const AppContext = React.createContext()

const AppProvider = ({ children }) => {

  const [loading, setLoading] = useState(true)
  const [searchTerm, setSearchTerm] = useState('')
  const [cocktails, setCocktails] = useState([])

  const fetchDrinks = async  () => {
    setLoading(true)
    try {
      const response = await fetch( `${DRINK_URL}`, {mode: 'cors'})
      const data = await response.json()
      console.log(data)
      const { drinks } = data;

      if(drinks){
        const newCocktails = drinks.map((item) => {
          const {
            id,
            drinkName,
            imageUrl,
            strAlcoholic,
            glassType
          } = item;
          return {
            id: id,
            name: drinkName,
            image: imageUrl,
            info: strAlcoholic,
            glass: glassType
          }
        })
        setCocktails(newCocktails)
      } else {
        setCocktails([])
      }
      setLoading(false)

    } catch (error){
      console.log(error)
      setLoading(false)
    }
  }

  useEffect(() => {
    fetchDrinks()
  }, [searchTerm])

  return <AppContext.Provider value={{
    loading,
    searchTerm,
    cocktails,
    setSearchTerm
  }}>{children}</AppContext.Provider>
}
// make sure use
export const useGlobalContext = () => {
  return useContext(AppContext)
}

export { AppContext, AppProvider }
