import React from 'react'
import {NavMenu} from './NavMenu';
import {Calendar} from './Calendar';
import {Evento} from './Evento';

export default function eventoTemplate() {
    return (
        <main>
            {NavMenu()}
            {Calendar()}
            {Evento()}
        </main>
    )
}