import React from 'react'
import {Home} from './Home';
import {Compromissos} from './Compromissos'
import {Lab} from './Lab'
import {Representantes} from './Representantes';

export default function PostTemplate() {
    return (
        <main>
            {Home()}
            {Compromissos()}
            {Lab()}
            {Representantes()}
        </main>
    )
}