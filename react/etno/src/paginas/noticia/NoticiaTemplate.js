import React from 'react'
import {Home} from './Home';
import {NavBarBottom} from '../../library/NavBarBottom';

export default function noticiaTemplate() {
    return (
        <main>
            {Home()}
            {NavBarBottom()}
        </main>
    )
}