import { IMeta, NewMeta } from './meta.model';

export const sampleWithRequiredData: IMeta = {
  id: 17187,
  linguagem: 11470,
  humanas: 8277,
  natureza: 12579,
  matematica: 4461,
};

export const sampleWithPartialData: IMeta = {
  id: 15622,
  linguagem: 24285,
  humanas: 14505,
  natureza: 17853,
  matematica: 21225,
};

export const sampleWithFullData: IMeta = {
  id: 32703,
  linguagem: 5776,
  humanas: 406,
  natureza: 29614,
  matematica: 11423,
};

export const sampleWithNewData: NewMeta = {
  linguagem: 16271,
  humanas: 27853,
  natureza: 32469,
  matematica: 12634,
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
