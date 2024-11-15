import React from 'react'
import {Home} from './Home';
import {Noticia} from './Noticia';
import {Evento} from './Evento';
import {Post} from './Post';
import {Sobre} from './Sobre';
import {Faq} from './Faq';

export default function IndexTemplate() {
    return (
        <main>
            {Home()}
            {Noticia()}
            {Evento()}
            {Post()}
            {Sobre()}
            {Faq()}
        </main>
    )
}