import React from 'react'
import {Home} from './Home';
import {Noticias} from './Noticias';
import {NavBarBottom} from '../../library/NavBarBottom';
import {ErrorSearch} from './ErrorSearch'

export default function noticiaTemplate() {
    return (
        <main>
            {Home()}
            {Noticias()}
            {ErrorSearch()}
            {NavBarBottom()}
        </main>
    )
}