import React from 'react';
import { Route, Routes, useLocation } from 'react-router-dom';

import PrivateRoute from './PrivateRoute';
import Index from './../paginas/index/IndexTemplate';
import Noticia from './../paginas/noticia/NoticiaTemplate';
import Evento from './../paginas/evento/EventoTemplate';
import Post from './../paginas/post/PostTemplate';

const Rotas = () => {
  const location = useLocation();

  React.useEffect(() => {
    if (location.pathname === '/') {
      require('./../style/pages/index/style.css');
    } else if (location.pathname === '/noticias') {
      require('./../style/pages/noticias/style.css');
    } else if (location.pathname === '/eventos') {
      require('./../style/pages/eventos/style.css');
    } else if (location.pathname === '/posts') {
      require('./../style/pages/posts/style.css');
    } else if (location.pathname === '/sobre') {
      require('./../style/pages/sobre/style.css');
    } else if (location.pathname === '/faq') {
      require('./../style/pages/faq/style.css');
    }
  }, [location.pathname]);

  return (
    <>
      <Routes>
        <Route element={<PrivateRoute />}>
          <Route path="/" element={<Index />} />
          <Route path="/noticias" element={<Noticia />} />
          <Route path="/eventos" element={<Evento />} />
          <Route path="/posts" element={<Post />} />
        </Route>
      </Routes>
    </>
  );
};

export default Rotas;
