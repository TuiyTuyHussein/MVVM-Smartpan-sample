/**
 * Copyright 2016 Erik Jhordan Rey.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package smartpan.sa.mvvmsmartpansample.view.activities;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;

import smartpan.sa.mvvmsmartpansample.R;
import smartpan.sa.mvvmsmartpansample.databinding.ItemRowBinding;
import smartpan.sa.mvvmsmartpansample.viewmodel.ItemViewModel;

public class ItemsAdapter<T> extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    private List<T> array = new LinkedList<>();

    ItemsAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRowBinding itemBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_row,
                        parent, false);
        return new ViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindItem(array.get(position));
    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    void setArray(List<T> array) {
        if (array == null || array.size() == 0) return;
        this.array.clear();
        this.array.addAll(array);
        notifyDataSetChanged();
    }

    static class ViewHolder<T> extends RecyclerView.ViewHolder {
        ItemRowBinding mItemRowBinding;

        ViewHolder(ItemRowBinding itemPeopleBinding) {
            super(itemPeopleBinding.getRoot());
            this.mItemRowBinding = itemPeopleBinding;
        }

        void bindItem(T item) {
            if (mItemRowBinding.getItemViewModel() == null) {
                mItemRowBinding.setItemViewModel(new ItemViewModel(item));
            } else {
                mItemRowBinding.getItemViewModel().setItem(item);
            }
        }
    }
}
