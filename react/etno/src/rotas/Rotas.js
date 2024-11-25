import React from 'react';
import { Route, Routes, useLocation } from 'react-router-dom';

import PrivateRoute from './PrivateRoute';
import Index from './../paginas/index/IndexTemplate';
import Noticia from './../paginas/noticia/NoticiaTemplate';

const Rotas = () => {
  const location = useLocation();

  React.useEffect(() => {
    if (location.pathname === '/') {
      require('./../style/pages/index/style.css');
    } else if (location.pathname === '/noticias') {
      require('./../style/pages/noticias/style.css');
    }
  }, [location.pathname]);

  return (
    <>
      <Routes>
        <Route element={<PrivateRoute />}>
          <Route path="/" element={<Index />} />
          <Route path="/noticias" element={<Noticia />} />
        </Route>
      </Routes>
    </>
  );
};

export default Rotas;
