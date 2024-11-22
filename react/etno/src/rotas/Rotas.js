import React from 'react'
import { Route, Routes } from 'react-router-dom'

import PrivateRoute from './PrivateRoute'
import Index from './../paginas/index/IndexTemplate'
import {Home} from './../paginas/index/Home'

const Rotas = () => {
  return (
    <>
      <Routes>
          <Route element={<PrivateRoute/>}>
              <Route path='/' element={<Index/>} />
              <Route path='/teste' element={<Home/>} />
          </Route>
      </Routes>
    </>
  )
}

export default Rotas
