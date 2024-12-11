import React from 'react'
import {Home} from './Home';
// import {Eventos} from './Eventos';

export default function IndexTemplate() {
    return (
        <main>
            {Home()}
            {/* {Eventos()} */}
        </main>
    )
}