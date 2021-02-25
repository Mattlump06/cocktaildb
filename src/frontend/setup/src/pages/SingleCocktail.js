import React, {useEffect, useState} from 'react'
import Loading from '../components/Loading'
import { useParams, Link } from 'react-router-dom'
import axios from "axios";




const SingleCocktail = () => {

    const {id} = useParams()
    const [loading, setLoading] = React.useState(false)
    const [drink, setDrink] = React.useState("");

    const url = 'http://localhost:8080/api/all/' + id

    useEffect(()=> {
        const getDrink = () => {

            axios.get(url).then((res)=>{

                let data = res.data.drinks
                setDrink(data)

            })
        }
    getDrink()
    },[drink])





    return (
        <section className='section cocktail-section'>
            <Link to='/' className='btn btn-primary'>
                back home
            </Link>
            <h2 className='section-title'>{drink.drinkName}</h2>
            <div className='drink'>
                <img src={drink.imageUrl} alt={drink.drinkName}/>
                <div className='drink-info'>
                    <p>
                        <span className='drink-data'>name :</span> {drink.drinkName}
                    </p>
                    <p>
                        <span className='drink-data'>Glass :</span> {drink.glassType}
                    </p>
                    <p>
                        <span className='drink-data'>info :</span> {drink.strAlcoholic}
                    </p>
                    <p>
                        <span className='drink-data'>details :</span> {drink.drinkDetails}
                    </p>
                </div>
            </div>
        </section>

    )


}

export default SingleCocktail
