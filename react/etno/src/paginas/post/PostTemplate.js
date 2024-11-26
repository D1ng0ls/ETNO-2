import React from 'react'
import {Home} from './Home';
import {Facebook} from './Facebook';
import {Instagram} from './Instagram';
import {Curiosidade} from './Curiosidade'
import {NavBarBottom} from '../../library/NavBarBottom';

export default function PostTemplate() {
    return (
        <main className='main-content'>
            {Home()}
            {Facebook()}
            {Instagram()}
            {Curiosidade()}
            {NavBarBottom()}
        </main>
    )
}