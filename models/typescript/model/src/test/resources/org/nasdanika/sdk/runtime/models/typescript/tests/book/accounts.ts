import { Currency } from "../model/common.js";
import { AbstractAccount } from "../model/bank.js";
import type { Account } from "../model/bank.js";
import type { Account as Account$2 } from "../model/legacy.js";

export function open(id: string): Account {
  const opened = new CheckingAccount();
  console.log(`Opened ${id} in ${Currency.USD}`);
  return opened;
}

export class CheckingAccount extends AbstractAccount {
  migratedFrom?: Account$2;
}
