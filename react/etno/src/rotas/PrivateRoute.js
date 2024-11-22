import React from 'react'
import Header from './../library/Header'
import Footer from './../library/Footer'
import { Outlet } from 'react-router-dom'

const PrivateRoute = () => {
  return (
    <>
      <Header/>
        <Outlet/>
      <Footer/>
    </>
  )
}

export default PrivateRoute